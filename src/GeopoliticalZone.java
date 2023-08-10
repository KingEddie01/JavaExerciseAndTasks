public enum GeopoliticalZone{
        NORTH_WEST(new String[]{"Sokoto", "Kebbi","Zamfara","Katsina","Kaduna","Kano","JIgawa"}),
        NORTH_EAST(new String[]{"Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"}),
        NORTH_CENTRAL(new String[]{"Benue","Kogi","Kwara","Nassarawa","Niger","Plateau"}),
        SOUTH_EAST(new String[]{"Abia","Anambra","Ebonyi","Enugu","Imo"}),
        SOUTH_WEST(new String[]{"Ondo","Osun","Oyo","Ekiti","Lagos","Ogun"}),
        SOUTH_SOUTH(new String[]{"Akwa Ibom","Bayelsa","Cross River,"});

        private String[] states;

        GeopoliticalZone(String[] states){
            this.states = states;
        }
        public String[] getStates(){
                return states;
        }
        public void setStates(String[] states){
                this.states = states;
        }
        public static  GeopoliticalZone getZone(String states){
                for (GeopoliticalZone zone : GeopoliticalZone.values()){
                        for (String value: zone.getStates()){
                                if (value.equalsIgnoreCase(states)) return zone;
                        }
                }

        throw  new NullPointerException("Invalid state");
        }



}













