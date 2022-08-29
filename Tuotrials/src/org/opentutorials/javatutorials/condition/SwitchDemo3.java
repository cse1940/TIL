package org.opentutorials.javatutorials.condition;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// break를 만나면 switch문의 실행이 즉시 중지된다.
		// 가장 마지막은 default로 끝난다.
		// 즉, 주어진 케이스가 없는 경우 default문이 실행된다.
		System.out.println("switch(1)");
        switch(1){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
        	System.out.println("default");
        	break;
        }
         
        System.out.println("switch(2)");
        switch(2){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
        	System.out.println("default");
        	break;
        }
         
        System.out.println("switch(3)");
        switch(3){
        case 1:
            System.out.println("one");
            break;
        case 2:
            System.out.println("two");
            break;
        case 3:
            System.out.println("three");
            break;
        default:
        	System.out.println("default");
        	break;
        }
	}

}
