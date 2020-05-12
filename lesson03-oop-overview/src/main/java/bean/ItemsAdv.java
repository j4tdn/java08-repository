package bean;

public class ItemsAdv {
	
	public ItemsAdv() {
		
	}
	public ItemsAdv(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
	}
	public Builder builder() {
		return new Builder();
	}
	
	private String name ;
	private int age ;
	
	public static class Builder {
		public Builder() {
			
		}
		
		private String name ;
		private int age ;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder age(int age) {
			
			this.age = age;
			return this;
		}
		
		public ItemsAdv build() {
			return new ItemsAdv(this);
		}
		
		
	}
	
}
