import requests
from requests import RequestException
import urllib.request as ur
from lxml import etree


def get_url(name):
    if name == "体育":
        url = "https://sports.qq.com/"
        html = get_html(url)
        con = etree.HTML(html)
        content_list = con.xpath('//div[@class="scr-newsarea"]/p/a/@href')
        for list in content_list:
            list = str(list)
            if list.endswith('.htm') and list.startswith('http:'):
                with open("test.txt", 'a', encoding='utf8') as f:
                    f.write("体育\t")

                url = list
                print(url)
                html = get_html(url)
                con = etree.HTML(html)
                content_list = con.xpath('//div[@class="qq_article"]//p/text()')
                for content in content_list:
                    with open("test.txt", 'a',encoding='utf8') as f:
                        f.write(content)
                with open("test.txt", 'a',encoding='utf8') as f:
                    f.write("\n")

    elif name == "娱乐":
        url = "https://new.qq.com/ch/ent/"
        html = get_html(url)
        con = etree.HTML(html)
        content_list = con.xpath('//div[@class="scr-newsarea"]/p/a/@href')
        for list in content_list:
            list = str(list)
            if list.endswith('.htm') and list.startswith('http:'):
                with open("test.txt", 'a', encoding='utf8') as f:
                    f.write("体育\t")

                url = list
                print(url)
                html = get_html(url)
                con = etree.HTML(html)
                content_list = con.xpath('//div[@class="qq_article"]//p/text()')
                for content in content_list:
                    with open("test.txt", 'a', encoding='utf8') as f:
                        f.write(content)
                with open("test.txt", 'a', encoding='utf8') as f:
                    f.write("\n")
    # # elif name == "家居":
    # #     url = "http://www.jia360.com/"
    # #     return url
    # # elif name == "房产":
    # #     url = "https://house.qq.com/"
    # #     return url
    # # elif name == "教育":
    # #     url = "https://www.toutiao.com/ch/news_baby/"
    # #     return url
    # elif name == "时尚":
    #     url = "https://www.toutiao.com/ch/news_fashion/"
    #     return url
    # elif name == "时政":
    #     url = "https://www.toutiao.com/ch/news_world/"
    #     return url
    # elif name == "游戏":
    #     url = "https://www.toutiao.com/ch/news_game/"
    #     return url
    # elif name == "科技":
    #     url = "https://www.toutiao.com/ch/news_tech/"
    #     return url
    # elif name == "财经":
    #     url = "https://www.toutiao.com/ch/news_finance/"
    #     return url


def get_html(url):
    try:
        response = requests.get(url)
        if response.status_code == 200:
            return response.text
        return None
    except RequestException:
        return None




if __name__ == '__main__':
    name=input("shakdjh as:")
    get_url(name)