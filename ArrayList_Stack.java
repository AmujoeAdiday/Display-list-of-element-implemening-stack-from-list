import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ArrayList_Stack {
    // declare a class – level array list
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        //** ArrayList will add each element to the end of the list

        System.out.println("Added client 1 -5 to the list in order.");

        // add an element to the array list
        list.add("client 1");
        // add an element to the array list
        list.add("client 2");
        // add an element to the array list
        list.add("client 3");
        // add an element to the array list
        list.add("client 4");

        // reverse the list to create the stack
        Collections.reverse(list);
        System.out.println("Reverse the list");
        displayStack();
        pop();
        System.out.println("Pop one element from the list");
        displayStack();
        pop();
        System.out.println("Pop one element from the list");

        displayStack();
        push("client 5");

        System.out.println("Add one element from the list");
        displayStack();

        pop();
        System.out.println("Pop one element from the list");
        displayStack();

        System.out.println("The current top element of the stack is "+ top());

        displayStack();
        System.out.println("Check whether the stack is empty : "+ isEmpty());

        displayStack();
    }
    public static void displayStack() {
// declare a date object
        Date myDate = new Date();
        String myDateFormat = "MM/dd/yyyy";
        SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);

//        Collections.reverse(list);


        // store the stack elements in a StringBuilder object
        StringBuilder sb = new StringBuilder();
        // declare an Iterator object
        Iterator<String> itr = list.iterator();
        // iterate through the list of elements in the ArrayList
        System.out.println("iterate through ArrayList elements");
        while (itr.hasNext()) {
            sb.append(itr.next() + "\n");
        }

        // display the stack elements in a Dialog Box
        JOptionPane.showMessageDialog(null, dtToday.format(myDate) +
                "\n" + "display elements \n" + sb);
//        // pop an element
//        pop();
//        // pop an element
//        pop();
//
        // clear the StringBuilder object
//        sb.setLength(0);
////
//         //update the Iterator object
//        itr = list.iterator();
//
//        // store the updated stack elements in a StringBuilder object
//        System.out.println("iterate through ArrayList elements");
//        while (itr.hasNext()) {
//            sb.append(itr.next() + "\n");
        // }
//
//        // display the current stack elements in a Dialog Box
//        JOptionPane.showMessageDialog(null, dtToday.format(myDate) +
//                "\n" + "display elements \n" + sb);
    }



    // define the pop() method
    public static void pop()

    {

        // declare an object to manipulate the list
        Object obj;

        // invoke the isEmpty method
        if (!(isEmpty()))
        {

            obj = list.remove(0);

            System.out.println(obj + " is removed from ArrayList");
        }
        else
            System.out.println("empty list");
    }

    public static void push(String st)
    {

        //add to the start of the list; without index it will automatically add to the end
        list.add(0,st);

        System.out.println(list.get(0)+ " is being added to the ArrayList.");

    }

    public static String top()
    {

        return list.get(0);

    }
    public static boolean isEmpty()
    {
        return list.isEmpty();
    }
}
