package View;

public class Bai4 {
public static void main(String[] args) {
	int a[] = { 1, 2, 4, 5, 6 };
	System.out.println("boi chung cua mang la:" +BCNN_Mang(a, 5));
}
public static int  UCLN(int a, int b){
    if(a==b) return a;
    if(a>b) 
       return UCLN(a-b,b);
    else
    	return  UCLN(a,b-a);
	
}
public static int BCNN(int a, int b){
    return (a*b/UCLN(a,b) );
}
public static int BCNN_Mang(int a[],int n){
    int temp = BCNN(a[0], a[1] );
    for(int i=2;i<n;i++){
        temp = BCNN(temp, a[i]);    
    }
    return temp;
}
}
