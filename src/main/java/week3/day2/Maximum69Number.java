package week3.day2;

public class Maximum69Number {

	
		
		public int maximum69Number(int num) {

	        int maxVal =0;
	        String s = "";
	        
	        String[] str = (Integer.toString(num)).split("");
	        int[] nArray = new int[str.length];

	        for(int i =0;i< str.length;i++){
	            if(Integer.parseInt(str[i]) == 9){
	                str[i] = "6";
	                StringBuilder sb = new StringBuilder();
	                for(int j=0;j<str.length;j++){
	                    sb.append(str[j]);
	                }
	                nArray[i] = Integer.parseInt(sb.toString());
	                str[i] = "9";
	                continue;

	            } else if (Integer.parseInt(str[i]) == 6) {
	                str[i] = "9";
	                StringBuilder sb = new StringBuilder();
	                for(int j=0;j<str.length;j++){
	                    sb.append(str[j]);
	                }
	                nArray[i] = Integer.parseInt(sb.toString());
	                str[i] = "6";
	                continue;
	            }

	        }
	        for(int i=0;i<nArray.length;i++){
	            if(maxVal > nArray[i]){
	                continue;
	            }else{
	                maxVal = nArray[i];
	            }

	        }
	        return maxVal;
	    }

	}


