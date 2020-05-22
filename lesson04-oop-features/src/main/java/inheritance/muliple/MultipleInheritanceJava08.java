package inheritance.muliple;

public class MultipleInheritanceJava08 implements Interface01, Interface02 {

	@Override
	public void method02() {
	}

	@Override
	public void method01() {
	}

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface01.super.log(str);
	}

}
