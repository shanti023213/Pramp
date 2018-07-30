package com.arrays.pramp;

public class MeetingSchedule {

 static int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {
	    
	    if(slotsA == null || slotsB==null || slotsA.length==0 || slotsB.length==0 ){
	      return new int[0];
	    }
	    int slotsANumber = 0;
	    int slotsBNumber = 0;
	    int[] result = new int[2];
	    while((slotsANumber<slotsA.length) && (slotsBNumber<slotsB.length)){
	        int start = Math.max(slotsA[slotsANumber][0] , slotsB[slotsBNumber][0]);
	        int end  = Math.min(slotsA[slotsANumber][1] , slotsB[slotsBNumber][1]);
	      
	      if(start+dur<=end){
	        result[0] = start;
	        result[1] = start+dur;
	        return result;
	      }else if(slotsA[slotsANumber][1] < slotsB[slotsBNumber][1]){
	        slotsANumber++;
	      }else{
	        slotsBNumber++;
	      }
	      
	  }
	    return new int[0];
	  }
	  public static void main(String[] args) {

		  	int[][] slotsA = {{7,12}};
		  	int[][] slotsB = {{2,11}};
		  	System.out.println("******"+ meetingPlanner(slotsA,slotsB, 5));
	  }

	}

