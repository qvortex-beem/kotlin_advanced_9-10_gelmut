fun main() {
    val manager = ResourceMenager()
    manager.add(OutpostResource(1, "Minerals", 120))
    manager.add(OutpostResource(2, "Gas", 40))
    val generator = EnergyGenerator()
    val lab = ResearchLab()
    generator.performAction(manager)
    lab.performAction(manager)
    println()
    manager.printAll()
}