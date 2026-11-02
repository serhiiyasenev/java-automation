# Trello credential incident response

This repository previously committed a Trello API key and API token in `src/main/java/trelloApi/TrelloApiClient.java`.

1. Immediately revoke the exposed Trello token and consider rotating the associated API key at the Trello developer/account settings.
2. Reissue credentials and provide them as environment variables to trusted runtime processes: `TRELLO_API_KEY` and `TRELLO_API_TOKEN`.
3. Never commit replacement credentials, store them in plaintext logs, or expose them to client-side applications.
4. Rewrite every reachable Git branch/tag containing the old values using `git-filter-repo`, then coordinate forks, collaborators, GitHub cached PR references and Support.
5. Run historical secret scanning after rewriting to ensure neither old value remains in reachable commits.

The source-code fix fails closed if either environment variable is missing. Removing credentials from the current branch does not revoke the old token or erase old Git history.
