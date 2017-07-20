public class Calculator
{
  private int result;
  public void add(int ... params){
     for (Integer param:params){
	this.result+=param;
}
}
public void mins(int... params) {
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result -= params[i];
        }
    }

public void mnoz(int... params) {
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            this.result *= params[i];
        }
    }

public void dil(int... params)  {
        this.result = params[0];
        for (int i = 1; i < params.length; i++) {
            if (params[i] == 0) {
                System.out.println("Division by zero!!!");
            }
            this.result /= params[i];
        }
    }
  public int getResult(){
      return this.result;
}
  public void clearResult(){
      this.result=0;
}
};