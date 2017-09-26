	/*	Author : Suhinthana A.P.N.
		E-mail : suchinthanaapn@gmail.com

		Created : 26/09/2017
					10:56:00h

		<<<<<< Compiles fine >>>>>

	*/

public class ItemDetails{

	private String symbol;
	private String security_name;
	private String marcket_category;
	private String test_issue;
	private String financial_status;
	private String round_lot_size;//not confirmed
	private double price;

	public ItemDetails(String[] fromFile){
		this.symbol = fromFile[0];
		this.security_name = fromFile[1];
		this.marcket_category = fromFile[2];
		this.test_issue = fromFile[3];
		this.financial_status = fromFile[4];
		this.round_lot_size = fromFile[5];
		this.price = Double.parseDouble(fromFile[6]);

	}

	public String get_symbol(){
		return symbol;
	}

	public String get_security_name(){
		return security_name;
	}

	public String get_marcket_category(){
		return marcket_category;
	}

	public String get_test_issue(){
		return test_issue;
	}

	public String get_financial_status(){
		return financial_status;
	}

	public String get_round_lot_size(){
		return round_lot_size;
	}

	public double get_price(){
		return price;
	}
}
