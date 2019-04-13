package s3.main;

import s3.evaluareCandidati.IEvaluabil;
import s3.evaluareCandidati.Student;
import s3.exceptions.CustomException;
import s3.utils.Utils;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws CustomException {
		int[] v= {10,5,10,10,5,5,6,4,7,5,5};
		int fr = Utils.getValFrecventaMaxima(v);
		System.out.println(fr);

		
	}

}
