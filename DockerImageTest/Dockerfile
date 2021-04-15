FROM ubuntu

RUN apt-get update

RUN apt-get -y install python

RUN apt-get -y install python3-pip

RUN pip3 install flask

RUN pip3 install flask-mysql

copy . /opt/source_code

ENTRYPOINT FLASK_APP=/opt/source_code/app.py flask run --host=0.0.0.0