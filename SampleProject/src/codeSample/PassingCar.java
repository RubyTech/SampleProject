package codeSample;

public class PassingCar {
	
	public static int solution(int[] A, int N) {
        int countZero = 0;
        int passingCarCount = 0;
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == 0){
                countZero++;
            } else {
                if(countZero > 0 && passingCarCount <= 1000000000){
                    passingCarCount = passingCarCount + countZero;
                } else if(passingCarCount > 1000000000){
                    return -1;
                }
            }

        }
        return passingCarCount;
    } 

}
