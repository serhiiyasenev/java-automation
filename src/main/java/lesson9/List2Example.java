package lesson9;

import java.util.*;

public class List2Example {

    public static void main(String[] args) {

        Random random = new Random(30);

        TreeSet<Integer> numberSet = new TreeSet<>();

        for (int i=0; i<1000; i++)
        {
            numberSet.add(random.nextInt(10));
        }
        System.out.println(numberSet);
        List<Student> myStudent = new List<Student>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Student> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Student student) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Student> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Student> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Student get(int index) {
                return null;
            }

            @Override
            public Student set(int index, Student element) {
                return null;
            }

            @Override
            public void add(int index, Student element) {

            }

            @Override
            public Student remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Student> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Student> listIterator(int index) {
                return null;
            }

            @Override
            public List<Student> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }
}