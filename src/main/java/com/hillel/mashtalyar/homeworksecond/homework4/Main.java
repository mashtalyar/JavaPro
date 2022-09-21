package com.hillel.mashtalyar.homeworksecond.homework4;

import com.hillel.mashtalyar.homeworksecond.homework4.firsttrea.*;
import com.hillel.mashtalyar.homeworksecond.homework4.interfaces.FirstInterfaceForAnimals;
import com.hillel.mashtalyar.homeworksecond.homework4.interfaces.FirstInterfaceForWorkers;
import com.hillel.mashtalyar.homeworksecond.homework4.interfaces.SecondInterfaceForAnimals;
import com.hillel.mashtalyar.homeworksecond.homework4.interfaces.SecondInterfaceForWorkers;
import com.hillel.mashtalyar.homeworksecond.homework4.secondtrea.*;

public class Main {
    public static void main(String[] args) {
        Workers worker=new Workers() {
            @Override
            public void workersGoToTheJob() {
                super.workersGoToTheJob();
            }

            @Override
            public void workersMustWork() {
                super.workersMustWork();
            }

            @Override
            public void workersMustChill() {

            }

            @Override
            public void workersMustLunch() {
                super.workersMustLunch();
            }

            @Override
            public void workersMustDrink() {

            }

        };
        Engineers engineers=new Engineers() {
            @Override
            public void workersMustChill() {

            }

            @Override
            public void workersMustDrink() {

            }

            @Override
            public void engineersGoToTheSites() {
                super.engineersGoToTheSites();
            }
        };
        Electrician electrician=new Electrician();
        Mechanic mechanic=new Mechanic();
        Locksmith locksmith=new Locksmith();

        worker.name="Alex";
        worker.workExperience="15years";
        electrician.name="Evgen";
        electrician.salary=23000.50;
        mechanic.name="Serhii";
        mechanic.salary=23000.75;
        locksmith.name="Illya";
        locksmith.salary=23000.25;
        FirstInterfaceForWorkers firstInterfaceForWorkers= new FirstInterfaceForWorkers() {
            @Override
            public void workersMustWork() {

            }

            @Override
            public void workersMustChill() {

            }
        };
        SecondInterfaceForWorkers secondInterfaceForWorkers=new SecondInterfaceForWorkers() {
            @Override
            public void workersMustLunch() {

            }

            @Override
            public void workersMustDrink() {

            }

            @Override
            public void workersMustWork() {

            }

            @Override
            public void workersMustChill() {

            }
        };


        Animals animal=new Animals() {
            @Override
            public void animalsActivity() {
                super.animalsActivity();
            }

            @Override
            public void animalMustEat() {
                super.animalMustEat();
            }

            @Override
            public void animalMupstSleap() {

            }

            @Override
            public void animalsMustDrink() {
                super.animalsMustDrink();
            }

            @Override
            public void animalsMustProcreate() {

            }

            @Override
            public void creaturesMustBreathe() {
                super.creaturesMustBreathe();
            }

            @Override
            public void creaturesMustBe() {

            }
        };
        Mammals mammal=new Mammals() {
            @Override
            public void creaturesMustBe() {

            }

            @Override
            public void animalsMustProcreate() {

            }

            @Override
            public void animalMupstSleap() {

            }

            @Override
            public void mammalsActivity() {
                super.mammalsActivity();
            }
        };
        Eagle eagle=new Eagle();
        Bear bear=new Bear();
        Lion lion=new Lion();
        animal.weight=150;
        animal.color="Black";
        mammal.numberOfLegs=4;
        mammal.numberOfTails=1;
        bear.weight=730;
        bear.color="Brown";
        lion.speed=70;
        lion.numberOfTeeth=46;
        FirstInterfaceForAnimals firstInterfaceForAnimals=new FirstInterfaceForAnimals() {
            @Override
            public void animalMustEat() {

            }

            @Override
            public void animalMupstSleap() {

            }
        };
        SecondInterfaceForAnimals secondInterfaceForAnimals=new SecondInterfaceForAnimals() {
            @Override
            public void animalsMustDrink() {

            }

            @Override
            public void animalsMustProcreate() {

            }

            @Override
            public void animalMustEat() {

            }

            @Override
            public void animalMupstSleap() {

            }
        };
        worker.workersGoToTheJob();
        worker.workersMustWork();
        worker.workersMustLunch();

        engineers.engineersGoToTheSites();
        engineers.workersMustWork();
        engineers.workersMustLunch();

        electrician.electricianWork();
        electrician.workersMustWork();
        electrician.workersMustLunch();

        locksmith.locksmithWork();
        locksmith.workersMustWork();
        locksmith.workersMustLunch();

        mechanic.mechanicWork();
        mechanic.workersMustWork();
        mechanic.workersMustLunch();

        animal.animalsActivity();
        animal.animalsMustDrink();
        animal.animalMustEat();
        animal.creaturesMustBreathe();

        mammal.mammalsActivity();
        mammal.animalsMustDrink();
        mammal.animalMustEat();
        mammal.creaturesMustBreathe();

        eagle.eagleActivity();
        eagle.animalsMustDrink();
        eagle.animalMustEat();
        eagle.creaturesMustBreathe();

        bear.bearActivity();
        bear.animalsMustDrink();
        bear.animalMustEat();
        bear.creaturesMustBreathe();

        lion.lionActivity();
        lion.animalsMustDrink();
        lion.animalMustEat();
        lion.creaturesMustBreathe();

    }
}
