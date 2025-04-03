package Island.Animals.Predators.Representatives

import Island.Animals.Predators.Predator
import Simulation.Config.SimulationConfig

class Eagle : Predator(
    name = "Орел",
    weight = SimulationConfig.animalCharacteristics["Орел"]!!.weight,
    maxCount = SimulationConfig.animalCharacteristics["Орел"]!!.maxCount,
    speed = SimulationConfig.animalCharacteristics["Орел"]!!.speed,
    foodNeeded = SimulationConfig.animalCharacteristics["Орел"]!!.foodNeeded,
    offspringCount = SimulationConfig.animalCharacteristics["Орел"]!!.offspringCount
)