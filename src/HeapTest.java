public class HeapTest{
	public static void main(String[] args){
		PriQueueInterface<String> test = new Heap<String>(10);
		test.enqueue("J");
		test.enqueue("A");
		test.enqueue("M");
		test.enqueue("B");
		test.enqueue("L");
		test.enqueue("E");
		System.out.println(test.toString());
		System.out.println(test.dequeue());
		System.out.println(test.toString());
		
	}
}
