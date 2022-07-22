package radiostation;

public interface BroadcastBuilder {

        // Total length
        public BroadcastBuilder countLength();

        // Total Income
        public BroadcastBuilder countIncome();

        // Saving to storage
        public BroadcastBuilder saveToStorage();

        // Этап 4

        public BroadcastBuilder fixInterior();

        // Выпуск автомобиля

        public Broadcast build();
    }
