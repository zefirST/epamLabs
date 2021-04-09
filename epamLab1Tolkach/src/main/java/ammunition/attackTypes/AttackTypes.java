package ammunition.attackTypes;

public enum AttackTypes {
    bloodyOne {
        public String bonusElementalDamage() {
            return "your bonus type of damage is damage by bleeding";
        }

        public String typeSuperpowerOfElementalDamage() {
            return "You've got a chance to get PowerOfBlood gain";
        }
    },

    fireBorn {
        public String bonusElementalDamage() {
            return "your bonus type of damage is damage by fire";
        }

        public String typeSuperpowerOfElementalDamage() {
            return "You've got a chance to get FireStorm gain";
        }
    },

    freezing {
        public String bonusElementalDamage() {
            return "your bonus type of damage is damage by cold";
        }

        public String typeSuperpowerOfElementalDamage() {
            return "You've got a chance to get ColdWind gain";
        }
    };


    public abstract String bonusElementalDamage();

    public abstract String typeSuperpowerOfElementalDamage();

}
