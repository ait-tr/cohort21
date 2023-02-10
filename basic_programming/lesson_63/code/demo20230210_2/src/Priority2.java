public enum Priority2 {
    LOW {
        public void sendMsg() {
            System.out.println("send by email");
        }
    },

    HIGH {
        public void sendMsg() {
            System.out.println("send by email!!!!!");
        }
    },
    URGENTLY {
        public void sendMsg() {
            System.out.println("send by email");
            System.out.println("call by phone");
        }

    };

    public abstract void sendMsg();


}


