
class Solution {
    public int[] solution(int N, int[] A) {
        int[] arrayOfCounters = new int[N];

        int maxValueOfArray = 0;
        int lastMaxValue = 0;

        for(int i = 0; i < A.length; ++i){

            if(A[i] > N){

                lastMaxValue = maxValueOfArray;

            } else {
                arrayOfCounters[A[i]-1] = Math.max(arrayOfCounters[A[i]-1], lastMaxValue);
                ++arrayOfCounters[A[i]-1];
                maxValueOfArray = Math.max(maxValueOfArray, arrayOfCounters[A[i]-1]);
            }


        }


        for(int i = 0; i < N; ++i){
            arrayOfCounters[i] = Math.max(arrayOfCounters[i], lastMaxValue);
        }


        return arrayOfCounters;
    }





}