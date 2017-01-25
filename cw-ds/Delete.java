
public class Main {

    //FunctionalArrayList list = new FunctionalArrayList();
    //FunctionalLinkedList list = new FunctionalLinkedList();
    SampleableListImpl list = new SampleableListImpl();

    public static void main(String[] args) {
        Main main = new Main();
        main.launch();
    }

    public void launch(){
        testArrayList();

//        testFunctionalArrayList();
//        testSampleableList();
//        ArrayList list = null;
        ImprovedStack s = new ImprovedStackImpl(null);
        System.out.println("--------------------------------------");
        ReturnObject obj0=s.top();
        printStuff(obj0);
        list.printList();

        obj0=s.pop();
        printStuff(obj0);
        list.printList();

        s.push("A0");
        printStuff(obj0);
        list.printList();

        s.push("A1");
        printStuff(obj0);
        list.printList();

        s.remove("A0");

        ImprovedStackImpl ss= (ImprovedStackImpl)s.reverse();
        ArrayList temp = (ArrayList)ss.getList();
        temp.printList();
    }

    public void testFunctionalArrayList(){
     //   FunctionalList list = new FunctionalArrayList();
        ReturnObject obj0 = list.head();
        printStuff(obj0);
        FunctionalList remaining = list.rest();
        int i=0;
        while (remaining.get(i).getReturnValue()!=null){
            System.out.println(remaining.get(i).getReturnValue());
            i++;
        }
    }

    public void testSampleableList(){
        SampleableList list1= list.sample();
        int i=0;
        while (list1.get(i).getReturnValue()!=null){
            System.out.println(list1.get(i).getReturnValue());
            i++;
        }
    }
    public void testArrayList(){
        // add elements + try adding null element
        for (int i=0; i<5; i++){
                ReturnObject obj0 = list.add(i,"A"+i);
                printStuff(obj0);
        }
        // add more elements than array size + try adding null element
//        for (int i=0; i<20000; i++){
//            if (i!=19999) {
//                ReturnObject obj0 = list.add(i);
//                printStuff(obj0);
//            } else{
//                ReturnObject obj0 = list.add(null);
//                printStuff(obj0);
//            }
//        }
        //remove first element
//        ReturnObject obj0 = list.remove(0);
//        list.printList();
//        printStuff(obj0);
//
//        // remove last element
//        obj0 = list.remove(list.size());
//        list.printList();
//        printStuff(obj0);
//
//        // remove element in the middle
//        obj0 = list.remove(1);
//        list.printList();
//        printStuff(obj0);

        // add element in head
//        obj0 = list.add(0,34);
//        list.printList();
//        printStuff(obj0);
//
//        // add element in head
//        obj0 = list.add(0,1);
//        list.printList();
//        printStuff(obj0);
//
//        // add element at end
//        obj0 = list.add(list.size() , 500);
//        list.printList();
//        printStuff(obj0);
//
//        // add element in middle
//        obj0 = list.add(list.size()-1,50);
//        list.printList();
//        printStuff(obj0);
    }

    public void printStuff(ReturnObject obj){
        System.out.println("Get Error: "+obj.getError());
        System.out.println("Get Value: "+obj.getReturnValue());
    }
}
