package chapter_3;

class PermissionManager {

    // 권한 비트 상수 정의
    // private의 경우에는 OperatorLab2 클래스에서 사용이 불가능 하므로 default로 변경
    static final int READ = 0;      // 읽기 권한 비트 위치
    static final int WRITE = 1;     // 쓰기 권한 비트 위치
    static final int EDIT = 2;      // 수정 권한 비트 위치
    static final int DELETE = 3;    // 삭제 권한 비트 위치

    private byte permissions = 0;   // 초기 권한 설정은 모두 비활성화 (0)

    /**
     * 권한 설정 메서드
     * @param permission    설정할 권한
     * @param enable    true: 권한 활성화, false: 권한 비활성화
     */
    void setPermission(int permission, boolean enable) {

        if (enable) {
            permissions |= (byte) (1 << permission);
        } else {
            permissions &= (byte) ~(1 << permission);
        }

    }

    /**
     * 권한 확인 메서드
     * @param permission    확인할 권한
     * @return  권한이 활성화 된 경우 true, 비활성화인 경우 false
     */
    boolean checkPermission(int permission) {
        int mask = 1 << permission;

        int result = permissions & mask;

        return result != 0;
    }

    /**
     * 모든 권한 초기화 메서드
     */
    void removeAllPermissions() {
        permissions = 0;
    }
}

public class OperatorLab2 {
    public static void main(String[] args) {
        PermissionManager pm = new PermissionManager();

//        읽기, 쓰기, 삭제 권한 설정
        pm.setPermission(PermissionManager.READ, true);
        pm.setPermission(PermissionManager.WRITE, true);
        pm.setPermission(PermissionManager.DELETE, true);

//        권한 확인
        System.out.println("읽기 권한: " + pm.checkPermission(PermissionManager.READ));
        System.out.println("쓰기 권한: " + pm.checkPermission(PermissionManager.WRITE));
        System.out.println("수정 권한: " + pm.checkPermission(PermissionManager.EDIT));
        System.out.println("삭제 권한: " + pm.checkPermission(PermissionManager.DELETE));

//        모든 권한 제거
        pm.removeAllPermissions();
        System.out.println("읽기 권한: " + pm.checkPermission(PermissionManager.READ));
        System.out.println("삭제 권한: " + pm.checkPermission(PermissionManager.DELETE));
    }
}
