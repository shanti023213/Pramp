package com.arrays.pramp;

public class NRoot {

	public static void main(String[] args) {
		
		System.out.println("NRoot:" + root(27,3));

	}
	
	static double root(double x, int n) { 
		
		if (x == 0){
          return 0;
		}

		double lowerBound = 0;
		double upperBound = Math.max(1, x);
		double approxRoot = (upperBound + lowerBound) / 2;

		while (approxRoot - lowerBound >= 0.001){
			if(Math.pow(approxRoot, n) > x){
				upperBound = approxRoot;
			}else if(Math.pow(approxRoot, n) < x){
				lowerBound = approxRoot;
			}else{
            break;
			}
		}
			approxRoot = (upperBound + lowerBound) / 2;

					return approxRoot;
    		}

}
