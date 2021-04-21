#-*- coding: utf-8 -*-
#encoding=utf-8
from PIL import Image, ImageDraw, ImageFont  

import time  
  
def watermark(img, img_ed, date, number, fnt):  
    """Adds a watermark to an image."""  
    #draw the watermark on the empty pic at a specified position  
    img_draw = ImageDraw.Draw(img_ed)  
    img_draw.text((134, 179), date, font=fnt, fill=(255,255,255,255))  
    img_draw.text((170, 10), number, font=fnt, fill=(255,255,255,255))  
  
    out = img_ed.paste(img, img_ed.size)  
    print out
    out.save("1.png",'PNG')  
    print "saved as gif"  
  
      
def daily():  
    img = Image.open("test.png").convert('RGBA')  
    date = time.strftime("%Y/%m/%d")  
    number = raw_input("Input the number please:")  
  
    #make a blank image for the text, initialized to transparent text color  
    img_ed = Image.new('RGBA', img.size, (255,255,255,0))  
    h,w = img.size  
  
    #draw txt on the pic      
    fnt = ImageFont.truetype('BRLNSR.TTF',12)  
  
    watermark(img, img_ed, date, number, fnt)  
  
  
if __name__ == '__main__':  
    daily()