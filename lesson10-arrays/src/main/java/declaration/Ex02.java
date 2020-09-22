package declaration;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class Ex02 {
public static void main(String[] args) {
	// Tim ra cac phan tu le trong mang
	int[] digits= {1,2,3,4,5,6,7,8,9};
	int [] oddDigits= getOddDigits(digits);
	printf(oddDigits);
	
	//2nd way: stream
int[] oddDigit2=	Arrays.stream(digits)
	.filter( digit->digit %2 !=0)
	.toArray();

printf(oddDigit2);

	// cal sum

int sum =Arrays.stream(digits).filter(digit -> digit %2 == 0).sum();
System.out.println(sum);

// cac pt trong stream chi dc duyet 1 lan duy nhat


	// find max

OptionalInt optionalMax=Arrays.stream(digits).max();
System.out.println("max: "+optionalMax.orElse(0));


	}

private static void printf(int[] digits) {
	
	for(int i:digits) {
		System.out.println(i);
	}
}


private static int[] getOddDigits(int[] digits) {
	int [] result = new int[digits.length];
	int index=0;
	
	for(int digit:digits) {
		if(digit%2!=0) {
			result[index++]=digit;
		}
	}
	return Arrays.copyOfRange(result, 0, index);
}
}

