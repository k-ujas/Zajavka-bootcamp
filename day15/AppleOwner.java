package zajavka.day15;

import zajavka.day15.vegetable.Apple;

public class AppleOwner {

    private Apple ownedApple;

    public AppleOwner(Apple ownedApple) {
        this.ownedApple = ownedApple;
    }

    public void doSthWithApple() {
        System.out.println(ownedApple.name);
    }
}
