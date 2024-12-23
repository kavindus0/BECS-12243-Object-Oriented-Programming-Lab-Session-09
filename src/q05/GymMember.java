package q05;


    public class GymMember {
        private String memberName;
        private int sessionsLeft;

        public GymMember() {
            this.memberName = null;
            this.sessionsLeft = 0;
        }


        public GymMember(String memberName, int sessionsLeft) {
            this.memberName = memberName;
            this.sessionsLeft = sessionsLeft;
        }

        public String getMemberName() {
            return memberName;
        }


        public int getSessionsLeft() {
            return sessionsLeft;
        }

        public void bookSession() {
            if (sessionsLeft > 0) {
                sessionsLeft--;
            } else {
                System.out.println("No sessions left to book.");
            }
        }


        public void cancelSession() {
            sessionsLeft++;
        }


        public void displayMemberInfo() {
            if (sessionsLeft > 0) {
                System.out.println("Member Name: " + memberName);
                System.out.println("Sessions Left: " + sessionsLeft);
            } else {
                System.out.println("Member Name: " + memberName);
                System.out.println("No sessions available.");
            }
        }
    }

