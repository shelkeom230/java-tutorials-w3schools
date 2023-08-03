import java.util.LinkedList;

public class prog28_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> colleges = new LinkedList<>();
        colleges.add("iit");
        colleges.add("nit");
        colleges.add("iit");
        colleges.add("bits");
        colleges.add("iist");
        colleges.add("uict");
        colleges.add("ism");
        colleges.add("symbosis");
        colleges.add("vit");
        colleges.add("anna university");
        colleges.add("dtu");
        colleges.add("nsut/nsit");
        colleges.add("gc colleges in states");

        System.out.println(colleges);

        /*
         * Both arraylist and linkedlist implements the list interface so they are
         * identical in case of all methods but the way they are built in are different.
         * 
         * How the ArrayList works
         * The ArrayList class has a regular array inside it. When an element is added,
         * it is placed into the array. If the array is not big enough, a new, larger
         * array is created to replace the old one and the old one is removed.
         * 
         * How the LinkedList works
         * The LinkedList stores its items in "containers." The list has a link to the
         * first container and each container has a link to the next container in the
         * list. To add an element to the list, the element is placed into a new
         * container and that container is linked to one of the other containers in the
         * list.,
         * 
         * Arraylist: for storing and accessing
         * Linkedlist: for manipulating data
         */

        colleges.addFirst("omkar shelke");
        System.out.println();
        System.out.println(colleges);
        colleges.addLast("sipna college of engineering and management studies");
        System.out.println();
        System.out.println(colleges);
        colleges.removeFirst();
        System.out.println();
        System.out.println(colleges);
        colleges.removeLast();
        System.out.println();
        System.out.println(colleges);
        String firstItem = colleges.getFirst();
        System.out.println(colleges);
        String lastItem = colleges.getLast();
        System.out.println(colleges);

    }

}
