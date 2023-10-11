import Araba
class SporAraba(Araba):
    def __init__(self, marka, model, turbo):
        super().__init__(marka, model)
        self.turbo = turbo

    def hareket_et(self):
        print("Spor araba hızlı bir şekilde hareket ediyor.")