from Sekil import Sekil
class Daire(Sekil):
    def __init__(self, yari_cap):
        self.yari_cap = yari_cap
    
    def alan_hesapla(self):
        return 3.14 * self.yari_cap * self.yari_cap