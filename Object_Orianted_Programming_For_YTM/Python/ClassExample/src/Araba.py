import Isurulebilir
class Araba(Isurulebilir):
    def __init__(self, marka, model):
        self.marka = marka
        self.model = model
        
    def __init__(self):
        self.__renk = ""
    
    def get_renk(self):
        return self.__renk
    
    def set_renk(self, yeni_renk):
        self.__renk = yeni_renk

    def calistir(self):
        print("Araba çalıştı.")

    def hareket_et(self):
        print("Araba hareket ediyor.")

    def ucakModuAktif(self):
        print("Araba ucmaya hazirlaniyor")