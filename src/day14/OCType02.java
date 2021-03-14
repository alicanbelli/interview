package day14;

public class OCType02 {

	public static void main(String[] args) {

		int var1 = 200;
        System.out.print(doCalc(var1));//400
        System.out.print(" " + var1);  //200
    }                                 // 400 200
    
    static int doCalc(int var1) {
        var1 = var1*2;//200*2 = 400
        return  var1; //400
        //what is the result?
    }


	}

