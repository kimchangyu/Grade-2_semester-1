package question4_BankAccount;

import java.util.Scanner;

public class BankAccount {
	int balance;
	BankAccount(int balance)
	{
		if (balance<0)
		{
			throw new IllegalArgumentException("밸런스가 음수입니다!");
		}
		this.balance=balance;
	}
	public void deposit(int depositMoney)
	{
		if (depositMoney<0)
		{
			throw new IllegalArgumentException("음수 입력한다고 출금 안됩니다. 출금 메소드 따로 있으니까 9처럼 굴지말고 당장 출금 메소드 쓰세요");
		}
		balance+=depositMoney;
	}
	public void withDraw (int withDrawMoney)
	{
		if ((0>withDrawMoney)||(balance<withDrawMoney))
		{
			throw new IllegalArgumentException("음수로 입력한다고 입금 안됩니다. 그리고 마이너스 통장 인정도 안되요.");
		}
		balance-=withDrawMoney;
	}
}
