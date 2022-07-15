// 문제 : 아래가 실행되도록 해주세요.
// 조건 : ArrayList 객체에서 내부적으로 Object 배열을 사용해서 데이터를 저장해야 합니다.
// 조건 : Object 배열의 초기 길이는 2 입니다.
// 조건 : 상황에 따라 배열의 길이는 자동으로 증가해야 합니다.
// 조건 : 엘리먼트(구성요소)를 하나 삭제하면 해당 요소 뒤의 요소들이 전부 앞으로 한칸씩 움직여야 합니다.
// 조건 : ArrayList의 인스턴스 변수는 2개만 사용할 수 있습니다.
// 조건 : 외부에서 호출하지 않는 속성은 private 키워드를 붙여주세요.
// 조건 : 중복을 최대한 제거해주세요.
// 조건 : 사용하는 변수와 if문, for문의 개수를 가독성을 떨어뜨리지 않는 선에서 최대한 줄여주세요.

class ArrayList {

    private int size;

    public ArrayList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(int i) {
        size++;
    }

    public int get(int i) {
        return 100;
    }

    public void showAllValues() {
    }

    public void removeAt(int i) {
    }
}
