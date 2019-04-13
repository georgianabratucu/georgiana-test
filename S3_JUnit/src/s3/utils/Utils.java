package s3.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import s3.exceptions.CustomException;

public final class Utils {

	private Utils() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int getValMax(int[] v) throws CustomException {
		if (v == null || v.length == 0)
			throw new CustomException();
		int max = v[0];
		for (int i = 1; i < v.length; i++)
			if (v[i] > max) {
				max = v[i];
			}
		return max;
	}
	
	public static int getPozitieValMax(int[] v) throws CustomException{
		if (v == null || v.length == 0)
			throw new CustomException();
		int iMax = 0;
		for (int i = 1; i < v.length; i++)
			if (v[i] > v[iMax]) {
				iMax = i;
			}
		return iMax;
	}

	public static int getNrAparitiiValMax(int[] v) throws CustomException {
		if (v == null || v.length == 0)
			throw new CustomException();
		int max = v[0], nrAp = 1;
		for (int i = 1; i < v.length; i++)
			if (v[i] > max) {
				max = v[i];
				nrAp = 1;
			} else if (v[i] == max) {
				nrAp++;
			}
		return nrAp;
	}

	public static int getValFrecventaMaxima(int[] v) throws CustomException {
		if (v == null || v.length == 0)
			throw new CustomException();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < v.length; i++) {
			if (map.containsKey(v[i])) {
				map.put(v[i], map.get(v[i]) + 1);
			} else {
				map.put(v[i], 1);
			}
		}
		int valFqMax = v[0];
		int fqMax = map.get(v[0]);

		for (Integer val : map.keySet()) {
			if (map.get(val) > fqMax) {
				valFqMax = val;
				fqMax = map.get(val);
			} else if (map.get(val) == fqMax && val > valFqMax) {
				valFqMax = val;
			}
		}

		return valFqMax;
	}
	
	public static float getMedieAritmetica(int[] v) throws CustomException {
		if (v == null || v.length == 0)
			throw new CustomException();
		
		float ma =0;
		for(int i=0;i<v.length;i++)
			ma += v[i];
		return ma/v.length;
	}
}
