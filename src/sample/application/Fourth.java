package sample.application;

public class Fourth {

	/**
	 * @param args
	 */
	public String name = null;
	public static String name2 = null;
	
	public Fourth(String a){
		this.name = a;
		name2 = a;
	}
	public void showName(){
		System.out.println(this.name);
	}
	public void showName2(){
		System.out.println(name2);
	}
	
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
			Fourth fourth = new Fourth(new String("hoge"));
			fourth.showName();	//hoge
			fourth.showName2();	//hoge
			Fourth fifth = new Fourth(new String("�ł��͂�"));
			fifth.showName();	//�ł��͂�
			fifth.showName2();	//�ł��͂�
			
			fourth.showName();	//hoge
			fourth.showName2();	//hoge
			
			String str = "ABCDEFABABC";
			System.out.println(str.concat("abc"));
			System.out.println(str.replace("AB","ab"));
			System.out.println(str.substring(3));
			System.out.println(str.substring(3,7));
			
	}

}
