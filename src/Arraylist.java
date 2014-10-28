import java.util.*;
public class Arraylist{
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		lista.add("Mikel");
		lista.add("Laburu");
		lista.add(1985);
		lista.add('M');
		lista.add(1.71);
		System.out.println("Lehen arraylist-aren elementuak: ");
		for (int i=0;i<lista.size();i++){
			System.out.print(" "+lista.get(i));
		}
		System.out.println();


		Scanner tecla=new Scanner(System.in);

		int zbk;
		ArrayList <Integer> listaEnteros = new ArrayList <Integer> ();
		do{
			System.out.println("Sartu zenbaki oso bat (bukatzeko 0 tekleatu): ");
			zbk= tecla.nextInt();
			if (zbk!=0){
				listaEnteros.add(zbk);
			}
		}while(zbk!=0);
		
		if (listaEnteros.size()==0){
			System.out.println("Zenbaki osoen arraylist-a hutsa dago");
		}else{
			System.out.println("Zenbaki osoen arraylist-aren edukia: ");
			for (int i=0; i<listaEnteros.size();i++){
				System.out.println(listaEnteros.get(i));
			}
			System.out.println("osoen Arraylist-ak "+listaEnteros.size()+" elementu ditu");
		}

		int posizioa;

		if (listaEnteros.size()==0){
			System.out.println("Arraylist-a hutsa dago.");
			//System.exit(0);
		}else{

			do{
				System.out.println("Sartu arralistaren posizio bat daukan edukia ikusteko (-1 bukatzeko)");
				posizioa=tecla.nextInt();
				if (posizioa!=-1){
					if (posizioa>=listaEnteros.size()){
						System.out.println("Posizio gutxiago ditu, sartu beste bat");
					}else{
						System.out.println(posizioa+". posizioaren edukia: "+listaEnteros.get(posizioa));
					}
				}else{
					System.out.println("Atera");
				}
			
			}while(posizioa!=-1);
		

		}
		System.out.println("Programa bukatua");


	}
	
}
