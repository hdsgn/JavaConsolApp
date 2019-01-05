package hdasgin.base.ornek9;

public class CokBoyutluDizi {
	public CokBoyutluDizi() {
		
		CokBoyutluDizi();
	}

	private void CokBoyutluDizi() {
		dizicokboyutlu();
	}
		private void dizicokboyutlu() {
		String [][] isimler = new String[10][];
		isimler [0]= new String[5];
		isimler [0][3]="hüseyin";
		System.out.println(isimler[0]);
		System.out.println(isimler[0][3]);	
		System.out.println(isimler[1][2]);
		System.out.println(isimler[2]);
		


//	String [][] isimler = new String [6][10];
	isimler [0][0] = "hüseyin";
	isimler [0][4] =  "fehime";
	isimler [0][2] =  "dilan";
	isimler [0][7] =  "ezgi";
	isimler [1][4] =  "seda nur";
	isimler [4][5] =  "tolga";
	isimler [5][6] =  "cihan";
//	System.out.println(isimler [0][0]);
//	System.out.println(isimler [0][4]);
//	System.out.println(isimler [0][2]);
//	System.out.println(isimler [0][7]);
//	System.out.println(isimler [1][4]);
//	System.out.println(isimler [4][5]);
//	System.out.println(isimler [5][6]);
//	System.out.println(isimler [4][6]);
	for (int i = 0; i < isimler.length; i++) {
		for (int j = 0; j < isimler[i].length; j++) {
			System.out.print(isimler[i][j]+ " ");
	}
		System.out.print("\n");
	}	
}

	
		// TODO Auto-generated method stub
		
	}
