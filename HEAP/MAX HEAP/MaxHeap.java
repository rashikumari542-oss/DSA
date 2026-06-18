public class MaxHeap {
    int[] heap;
    int size;
    int capacity;
    int parent(int index) {
        return (index - 1) / 2;
    }
    int leftChild(int index) {
        return 2 * index + 1;
    }
    int rightChild(int index) {
        return 2 * index + 2;
    }

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

  public void insert(int x){
        if(size == capacity){
            System.out.println("Heap is full");
            return;
        }
        heap[size] = x;
        size++;
        int current = size - 1;
        while(current > 0 && heap[current] > heap[parent(current)]){
            int temp = heap[current];
            heap[current] = heap[parent(current)];
            heap[parent(current)] = temp;
            current = parent(current);
        }}
        public void pop(){
        if(size == 0){
            System.out.println("Heap is empty");
            return;
        
        }
        heap[0] = heap[size - 1];
        size--;
        int current = 0;
        while(true){
            int left = leftChild(current);
            int right = rightChild(current);
            int largest = current;
            if(left < size && heap[left] > heap[largest]){
                largest = left;
            }
            if(right < size && heap[right] > heap[largest]){
                largest = right;
            }
            if(largest == current){
                break;
            }
            int temp = heap[current];
            heap[current] = heap[largest];
            heap[largest] = temp;
            current = largest;
        }}
        public void heapify(int index){
        int left = leftChild(index);    
        int right = rightChild(index);
        int largest = index;
        if(left < size && heap[left] > heap[largest]){
            largest = left;
        }
        if(right < size && heap[right] > heap[largest]){
            largest = right;
        }
        if(largest != index){
            int temp = heap[index];
            heap[index] = heap[largest];
            heap[largest] = temp;
            heapify(largest);
        }

  }
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(3);
        maxHeap.insert(1);
        maxHeap.insert(4);
        maxHeap.insert(1);
        maxHeap.insert(5);
        maxHeap.insert(9);
        maxHeap.insert(2);
        maxHeap.insert(6);
        maxHeap.insert(5);
        maxHeap.insert(3);
        
        System.out.println("Max Heap:");
        maxHeap.printHeap();
    }
}