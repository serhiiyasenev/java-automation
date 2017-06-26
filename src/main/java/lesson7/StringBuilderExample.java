package lesson7;


public class StringBuilderExample {
    public static void main(String[] args) {

       StringBuilder builder = new StringBuilder();
       int startOfSubstrIncl = 3;
       int endOfSubstrExcl = 5;
       int indexOffset = 4;
       int charIndex = 4;
       builder.append("new ending");
       builder.delete(indexOffset, endOfSubstrExcl);
       builder.insert(indexOffset, "some sub string");
       builder.replace(startOfSubstrIncl, endOfSubstrExcl, "replace");
       builder.setCharAt(charIndex, 'a');
       String builderString = builder.toString();

        System.out.println(builderString);

    }
}