package week4.dummy;

import java.util.ArrayList;
import java.util.List;

public class DummyContent {

    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    static {
        addItem(new DummyItem("이승기", 141213, "수학", 95, 20));
        addItem(new DummyItem("김수현", 141518, "영어", 90, 100));
        addItem(new DummyItem("주원", 141230, "수학", 76, 60));
        addItem(new DummyItem("김우빈", 141255, "수학", 85, 89));
        addItem(new DummyItem("이민호", 141590, "영어", 90, 95));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
    }

    public static class DummyItem {
        public DummyItem(String name, int studentSerialNumber,
				String majorSubject, int mathPoint, int englishPoint) {
			super();
			this.name = name;
			this.studentSerialNumber = studentSerialNumber;
			this.majorSubject = majorSubject;
			this.mathPoint = mathPoint;
			this.englishPoint = englishPoint;
		}
        
		public String name;
        public int studentSerialNumber;
        public String majorSubject;
        public int mathPoint;
        public int englishPoint;
    }
}
