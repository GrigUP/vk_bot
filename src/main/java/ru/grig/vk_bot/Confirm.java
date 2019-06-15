package ru.grig.vk_bot;

public interface Confirm {

    public class ConfirmRequest {
        private String type;
        private Integer group_id;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getGroup_id() {
            return group_id;
        }

        public void setGroup_id(Integer group_id) {
            this.group_id = group_id;
        }
    }

    class ConfirmRespone {

    }

}
