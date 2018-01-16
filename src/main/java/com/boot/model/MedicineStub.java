package com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.model.Medicine;

public class MedicineStub {
	private static Map<Long, Medicine> wrecks = new HashMap<Long, Medicine>();
	private static Long idIndex = 3L;

	//populate initial wrecks
	static {
		Medicine a = new Medicine(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
		wrecks.put(1L, a);
		Medicine b = new Medicine(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
		wrecks.put(2L, b);
		Medicine c = new Medicine(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
		wrecks.put(3L, c);
	}

	public static List<Medicine> list() {
		return new ArrayList<Medicine>(wrecks.values());
	}

	public static Medicine create(Medicine wreck) {
		idIndex += idIndex;
		wreck.setId(idIndex);
		wrecks.put(idIndex, wreck);
		return wreck;
	}

	public static Medicine get(Long id) {
		return wrecks.get(id);
	}

	public static Medicine update(Long id, Medicine wreck) {
		wrecks.put(id, wreck);
		return wreck;
	}

	public static Medicine delete(Long id) {
		return wrecks.remove(id);
	}
}
