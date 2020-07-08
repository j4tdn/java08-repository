
public class Ex05 { 
    public static void main(String[] args)  
    { 
        String X = "ABCEDEABC"; 
        String Y = "ABCEDCBBCK";
  
        int m = X.length(); 
        int n = Y.length(); 
        
        System.out.println("Length of Longest Common Substring is:");
        LCSubStr(X.toCharArray(), Y.toCharArray(), m, n); 
    } 
	
	public static void LCSubStr(char X[], char Y[], int m, int n)  
    { 
        int LCStuff[][] = new int[m + 1][n + 1]; 
        int max = 0;   
        StringBuilder res = new StringBuilder();
          
        for (int i = 0; i <= m; i++)  
        { 
            for (int j = 0; j <= n; j++)  
            { 
                if (i == 0 || j == 0) 
                    LCStuff[i][j] = 0; 
                else if (X[i - 1] == Y[j - 1]) 
                { 
                    LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1; 
                    //max = Integer.max(max, LCStuff[i][j]);
                    if (max < LCStuff[i][j]) {
                    	max = LCStuff[i][j];
                    	
                    	res.delete(0, res.length());                    	
                    	for (int k = i - max; k < i; k++) {
                    		res.append(X[k]);
                    	}
                    }
                    
                }  
                else
                    LCStuff[i][j] = 0; 
            } 
        } 
        	
       System.out.println(res);
    } 
          
}
