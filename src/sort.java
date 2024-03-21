import java.util.Arrays;
public class sort {

    public static void main(String[] args) {

        // 버블 정렬
        bubbleSort();

        //선택 정렬
        selectSort();

        //삽입 정렬
        insertionSort();
    }

    public static void bubbleSort(){
         int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        System.out.println("<정렬 전>");
        System.out.println(Arrays.toString(nums));

        // 한 번의 반복이 완료될 때 마다 가장 큰 수는 배열의 가장 마지막 부분으로 밀리는 것이 보장된다.
        for(int i = nums.length - 1; i > 0; i--) {
            // 따라서, 한 번의 반복마다 가장 뒤의 인덱스는 비교하지 않도록 반복문을 설계할 수 있다.
            for(int j = 0; j < i; j++) {
                // 만일, 앞의 수가 뒤의 수보다 더 크다면 swap 연산을 진행해준다.
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("<정렬 후>");
        System.out.println(Arrays.toString(nums));
    }

    public static void selectSort(){
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        System.out.println("<정렬 전>");
        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < nums.length - 1; i++) {
            // 현재 탐색에서 가장 앞의 원소를 초기 값으로 설정해둔다.
            int MinIndex = i;
            // 탐색을 진행하며, 가장 작은 값을 찾는다.
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[MinIndex] > nums[j])
                    MinIndex = j;
            }
            // 탐색이 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위치를 바꾸어준다.
            int temp = nums[MinIndex];
            nums[MinIndex] = nums[i];
            nums[i] = temp;
        }

        System.out.println("<정렬 후>");
        System.out.println(Arrays.toString(nums));
    }

    public static void insertionSort(){
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        System.out.println("<정렬 전>");
        System.out.println(Arrays.toString(nums));

        for(int i = 1; i < nums.length; i++) {
            // 현재 선택된 원소의 값을 임시 변수에 저장해준다.
            int temp = nums[i];
            // 현재 원소를 기준으로 이전 원소를 탐색하기 위한 index 변수.
            int prev = i - 1;
            // 현재 선택된 원소가 이전 원소보다 작은 경우까지만 반복. 단, 0번째 원소까지만 비교한다.
            while(prev >= 0 && nums[prev] > temp) {
                // 현재 선택된 원소가 현재 탐색중인 원소보다 작다면, 해당 원소는 다음 인덱스로 미뤄버린다.
                nums[prev + 1] = nums[prev];
                // 다음 대상 원소를 탐색한다.
                prev--;
            }
            // 탐색이 종료된 지점에 현재 선택되었던 변수의 값을 삽입해준다.
            nums[prev + 1] = temp;
        }

        System.out.println("<정렬 후>");
        System.out.println(Arrays.toString(nums));
    }


}
