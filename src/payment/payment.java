package payment;

public class payment {
          private int pid;
          private int cvv;
          private int craditnumber;
          private String banchName;
          
	public payment(int pid, int cvv, int craditnumber, String banchName) {
			super();
			this.pid = pid;
			this.cvv = cvv;
			this.craditnumber = craditnumber;
			this.banchName = banchName;
		}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getCraditnumber() {
		return craditnumber;
	}

	public void setCraditnumber(int craditnumber) {
		this.craditnumber = craditnumber;
	}

	public String getBanchName() {
		return banchName;
	}

	public void setBanchName(String banchName) {
		this.banchName = banchName;
	}

	public static void main(String[] args) {
		System.out.println("Payment Gatway");

	}

}
