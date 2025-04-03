package Island.Animals.Herbivores.Representatives

import Island.Animals.Herbivores.Herbivore
import Simulation.Config.SimulationConfig

class Boar : Herbivore(
    name = "Кабан",
    weight = SimulationConfig.animalCharacteristics["Кабан"]!!.weight,
    maxCount = SimulationConfig.animalCharacteristics["Кабан"]!!.maxCount,
    speed = SimulationConfig.animalCharacteristics["Кабан"]!!.speed,
    foodNeeded = SimulationConfig.animalCharacteristics["Кабан"]!!.foodNeeded,
    offspringCount = SimulationConfig.animalCharacteristics["Кабан"]!!.offspringCount
)