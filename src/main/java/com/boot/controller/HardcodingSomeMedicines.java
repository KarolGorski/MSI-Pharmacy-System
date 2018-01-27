package com.boot.controller;

import com.boot.model.Med;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// KLASA DO WKłADANIA HARDOCOWANYCH DANYCH


public class HardcodingSomeMedicines {
	private static Map<Long, Med > meds = new HashMap<Long, Med >();
	private static Long idIndex = 3L;

	//populate initial meds
	/*
	static {
		 Med a = new Med (1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
		meds.put(1L, a);
		 Med b = new Med (2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
		meds.put(2L, b);
		 Med c = new Med (3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
		meds.put(3L, c);
	}

	public static List Med  list() {
		return new ArrayList Med (meds.values());
	}

	public static Med  create Med  wreck) {
		idIndex += idIndex;
		wreck.setId(idIndex);
		meds.put(idIndex, wreck);
		return wreck;
	}

	public static Med  get(Long id) {
		return meds.get(id);
	}

	public static Med  update(Long id, Med  wreck) {
		meds.put(id, wreck);
		return wreck;
	}

	public static Med  delete(Long id) {
		return meds.remove(id);
	}
	*/
}
