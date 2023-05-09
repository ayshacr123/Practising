package com.example.Practising;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProfitAndLossPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<MainProfitOrLoss> t = new ArrayList<>();
		t.add(new MainProfitOrLoss("Bottle","buy",50));
		t.add(new MainProfitOrLoss("Bottle","sell",120));
		t.add(new MainProfitOrLoss("Bottle","sell",100));
		t.add(new MainProfitOrLoss("Bottle","buy",60));
		t.add(new MainProfitOrLoss("Bottle","sell",100));
		 Map<String, Double> netProfitOrLossByProduct = t.stream()
	                .collect(Collectors.groupingBy(MainProfitOrLoss::getProductName,
	                        Collectors.summingDouble(e -> {
	                            if (e.getTransactionType().equals("buy")) {
	                                return -e.getTransactionAmount();
	                            } else {
	                                return e.getTransactionAmount();
	                            }
	  
	                        })));
		 System.out.println("Net Profit or Loss by Product:");
	     netProfitOrLossByProduct.forEach((productName, netProfitOrLoss) ->
	             System.out.printf("%s: %.2f%n", productName, netProfitOrLoss));	
	}
	  
}
		
	
//		 Double fsell=0.0;
//		 Double fbuy=0.0;
//		 List<MainProfitOrLoss> sell=t.stream()
//		 .filter(i->i.getTransactionType().equals("sell")).toList(); 
//		 //System.out.println(sell);
//		 List<MainProfitOrLoss> buy=t.stream()
//		 .filter(i->i.getTransactionType().equals("buy")).toList(); 
//		 //System.out.println(buy);
//		 for(MainProfitOrLoss m:sell) {
//		 fsell+=m.getTransactionAmount();
//		 }
////		 System.out.println(fsell);
//		 for(MainProfitOrLoss a:buy) {
//		 fbuy+=a.getTransactionAmount();
//		 }
//		 //System.out.println(fbuy);
//		 if((fsell-fbuy)>=0)
//		 System.out.println("Profit is:"+(fsell-fbuy));
//		 else
//		 System.out.println("Loss is:"+(-fsell+fbuy));
//		 }
//		}
