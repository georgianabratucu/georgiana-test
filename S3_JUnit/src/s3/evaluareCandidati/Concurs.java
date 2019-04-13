package s3.evaluareCandidati;

import s3.exceptions.CustomException;
import s3.utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Concurs {
	ArrayList<IEvaluabil> listaCandidati;
	int punctajMinim;
	int nrCandidatiAcceptati;
	ArrayList<IEvaluabil> listaCandidatiAcceptati;
	
	public Concurs(int punctajMinim, int nrCandidatiAcceptati) {
		super();
		listaCandidati = new ArrayList<IEvaluabil>();
		this.punctajMinim = punctajMinim;
		this.nrCandidatiAcceptati = nrCandidatiAcceptati;
	}
	
	public void addCandidat(IEvaluabil c) {
		listaCandidati.add(c);
	}

	public void alegereCandidati() throws CustomException {
		// to do
		//se aleg primii nrCandidatiAcceptati in functie de 
		//media aritmetica a punctajelor obtinute
		//se incarca in listaCandidatiAcceptati

		/*HashMap<IEvaluabil, Float> map = new HashMap<>();
		for(int i=0;i<listaCandidati.size();i++){
			map.put(listaCandidati.get(i), Utils.getMedieAritmetica(listaCandidati.get(i).getScor()));
		}

		float max=0;
		IEvaluabil pozitie=null;
		int i=0;
		while (i<nrCandidatiAcceptati){
			for(IEvaluabil key :map.keySet()){
				if(map.get(key)>max){
					max=map.get(key);
					pozitie=key;
				}
			}
			listaCandidatiAcceptati.add(pozitie);
			map.remove(pozitie);
			nrCandidatiAcceptati++;
		}
*/
		List<IEvaluabil> aux=new ArrayList<>();
		for(int i=0;i<listaCandidati.size();i++){
			if(Utils.getMedieAritmetica(listaCandidati.get(i).getScor()) < Utils.getMedieAritmetica(listaCandidati.get(i+1).getScor())){
				IEvaluabil iEvaluabil=listaCandidati.get(i);
				listaCandidati.add(i,listaCandidati.get(i+1));
				listaCandidati.add(i+1,iEvaluabil);
			}
		}

		for (int i=0;i<nrCandidatiAcceptati;i++){
			listaCandidatiAcceptati.add(listaCandidati.get(i));
		}

	}
}
