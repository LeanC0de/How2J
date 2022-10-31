package character;
   
public class TestString {	
	public int ranASC () { //生成符合条件的ASCII码	
		int tmp;
		for(;;) {
			int num = (int)(Math.random()*122);
			if ((48<=num && num <= 57)||(65<=num && num <= 90)||(97<=num && num <= 122)) {
				tmp = num;
				break;
			}
		}
		return tmp;		
	}
   
    public static void main(String[] args) {
    	TestString test = new TestString(); //实例化以调用方法ranASC
    	
    	char[] cs = new char[5]; 			//创建一个长度为5的字符数组
    	
    	for(int i = 0;i < 5;i++) {			//将生成的随机ASCII码转换为字符并循环赋值给字符数组
    		cs[i] = (char)test.ranASC();	
    	}
    	
    	String str = new String(cs);		//通过字符数组创建字符串对象
    	System.out.println(str);
    	
    	
    }
}